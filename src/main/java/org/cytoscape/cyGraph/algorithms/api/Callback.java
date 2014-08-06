/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Callback function to be provided by the user.
 * 
 * @author Jimmy
 * 
 */
public interface Callback {

	public boolean notify(CyNode node, int time, int dist);
}
