/*
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
package net.sf.click.jquery.examples.control.panel;

import net.sf.click.jquery.examples.control.html.table.Cell;
import net.sf.click.jquery.examples.control.html.table.Row;
import org.apache.click.Control;

/**
 * Provides a panel that lays out its controls in a single vertical column.
 */
public class VerticalPanel extends AbstractTablePanel {

    // ----------------------------------------------------------- Constructors

    /**
     * Create a default VerticalPanel.
     */
    public VerticalPanel() {
        this(null);
    }

    /**
     * Create a VerticalPanel with the given name.
     *
     * @param name the name of the panel
     */
    public VerticalPanel(String name) {
       super(name);
       setBorder(0);
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Add the control to the panel.
     *
     * @param control the control to add
     * @return the added control
     */
    public Control add(Control control) {
        Row row = new Row();
        table.add(row);
        Cell cell = new Cell();
        cell.setStyle("text-align", getHorizontalAlignment());
        cell.setStyle("vertical-align", getVerticalAlignment());
        row.add(cell);
        cell.add(control);
        return control;
    }

    /**
     * Remove the control from the panel.
     *
     * @param control the control to remove
     * @return true if the control was removed, false otherwise
     */
    public boolean remove(Control control) {
        Row row = getRow(control);
        return table.remove(row);
    }
}
