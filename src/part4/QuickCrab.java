import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
    public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        int d = getDirection();
        Location loc = getLocation().getAdjacentLocation(d - 90);
        if (gr.isValid(loc) && gr.get(loc) == null && gr.isValid(loc.getAdjacentLocation(d - 90)) && gr.get(loc.getAdjacentLocation(d - 90)) == null)
            locs.add(loc.getAdjacentLocation(d - 90));
        loc = getLocation().getAdjacentLocation(d + 90);
        if (gr.isValid(loc) && gr.get(loc) == null && gr.isValid(loc.getAdjacentLocation(d + 90)) && gr.get(loc.getAdjacentLocation(d + 90)) == null)
            locs.add(loc.getAdjacentLocation(d + 90));

        if (locs.size() != 0)   {
            return locs;
        } else  {
            return super.getMoveLocations();
        }
	}
}
