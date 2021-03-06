/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.as.console.client.shared.subsys.messaging;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import org.jboss.as.console.client.shared.subsys.messaging.model.Queue;
import org.jboss.as.console.client.widgets.DialogueOptions;
import org.jboss.as.console.client.widgets.forms.CheckBoxItem;
import org.jboss.as.console.client.widgets.forms.Form;
import org.jboss.as.console.client.widgets.forms.FormValidation;
import org.jboss.as.console.client.widgets.forms.TextBoxItem;

/**
 * @author Heiko Braun
 * @date 5/12/11
 */
public class NewQueueWizard {

    private MessagingPresenter presenter;

    public NewQueueWizard(final MessagingPresenter presenter) {
        this.presenter = presenter;
    }

    Widget asWidget() {
        VerticalPanel layout = new VerticalPanel();
        layout.setStyleName("fill-layout-width");
        final Form<Queue> form = new Form<Queue>(Queue.class);


        TextBoxItem name = new TextBoxItem("name", "Name");
        TextBoxItem jndi = new TextBoxItem("jndiName", "JNDI");

        CheckBoxItem durable = new CheckBoxItem("durable", "Durable?");
        TextBoxItem selector = new TextBoxItem("selector", "Selector")
        {
            @Override
            public boolean isRequired() {
                return false;
            }
        };

        form.setFields(name, jndi, durable, selector);

        layout.add(form.asWidget());

        DialogueOptions options = new DialogueOptions(
            new ClickHandler() {

                @Override
                public void onClick(ClickEvent event) {

                    FormValidation validation = form.validate();
                    if(!validation.hasErrors())
                        presenter.onCreateQueue(form.getUpdatedEntity());
                }
            },
             new ClickHandler() {

                @Override
                public void onClick(ClickEvent event) {
                   presenter.closeDialogue();
                }
            }
        );

        layout.add(options);

        return layout;
    }
}
