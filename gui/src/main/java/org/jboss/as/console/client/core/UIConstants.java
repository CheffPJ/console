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

package org.jboss.as.console.client.core;

import com.google.gwt.i18n.client.Constants;

/**
 * @author Heiko Braun
 * @date 5/2/11
 */
public interface UIConstants extends Constants {

    String common_error_unexpectedHttpResponse();
    String common_error_detailsMissing();
    String common_error_failedToDecode();
    String common_error_deploymentFailed();
    String common_error_unknownError();

    String common_label_hostManagement();
    String common_label_profileManagement();
    String common_label_groupManagement();

    String common_label_serverInstances();

    String common_label_serverStatus();

    String common_label_serverGroup();

    String common_label_status();

    String common_label_server();

    String common_label_serverConfig();

    String common_label_serverInstance();

    String common_label_instanceDetails();

    String common_label_virtualMachine();

    String common_label_serverConfigs();

    String common_label_noRecords();

    String common_label_hostConfiguration();

    String common_label_systemProperties();

    String common_label_socketBindingGroups();

    String common_label_virtualMachines();

    String common_label_paths();

    String common_label_serverGroups();

    String common_label_deployments();

    String common_label_manageDeployments();

    String common_label_edit();
    String common_label_save();
    String common_label_delete();

    String common_label_createNewServerConfig();

    String common_label_attributes();
    String common_label_details();

    String common_label_name();

    String common_label_autoStart();

    String common_label_socketBinding();

    String common_label_portOffset();

    String common_label_hosts();

    String common_label_profiles();

    String common_label_noRecentMessages();

    String common_label_messageDetail();

    String common_label_messages();

    String common_label_newServerGroup();

    String common_label_profile();

    String common_label_add();

    String common_label_value();

    String common_label_key();

    String common_label_option();

    String common_label_basedOn();

    String common_label_cancel();

    String common_label_runtimeName();
    
    String common_label_verifyDeploymentNames();

    String common_label_settings();

    String common_label_generalConfig();

    String common_label_interfaces();

    String subsys_jca_dataSources();

    String subsys_jca_dataSourcesXA();

    String subsys_jca_newDataSource();

    String subsys_jca_dataSource();

    String subsys_jca_existingDataSources();

    String common_label_disable();

    String common_label_enable();

    String common_label_enOrDisable();

    String common_label_subsystems();
    
    String common_label_areYouSure();
    
    String common_label_addToGroup();
    
    String common_label_remove();
    
    String common_label_domain();
    
    String common_label_upload();
    
    String common_label_next();
    
    String common_label_deploymentSelection();
    
    String common_label_step();
    
    String common_label_chooseFile();
    
    String common_label_chooseServerGroup();
    
    String common_label_finish();
    
    String common_label_addContent();
    
    String common_label_contentRepository();
    
    String common_label_enabled();
    
    String common_error_contentStillAssignedToGroup();
    
    String subsys_logging_loggers();
    
    String subsys_logging_handlers();
    
    String subsys_logging_autoFlush();
    
    String subsys_logging_encoding();
    
    String subsys_logging_formatter();
    
    String subsys_logging_type();
    
    String subsys_logging_logLevel();
    
    String subsys_logging_queueLength();
    
    String subsys_logging_handlerConfigurations();

}
