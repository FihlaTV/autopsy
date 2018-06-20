/*
 * 
 * Autopsy Forensic Browser
 * 
 * Copyright 2018 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.commonfilesearch;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 * Default action for nodes which do not represent files, such as 
 * <code>InstanceCountNode</code> and <code>Md5Node</code>.
 */
public class NoAction extends AbstractAction {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("PMD")
    @Override
    public void actionPerformed(ActionEvent e) {
        //intentionally does nothing
    }
}
