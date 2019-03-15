import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter {

    private int c;

    public BlusterCritter(int c) {
        this.c = c
	}

    public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a != null)
				actors.add(a);
		}

		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
        for (Actor a : actors)  {
            if(a instanceof Rock)   {
                a.removeSelfFromGrid();
            }
        }
    }

    public ArrayList<Location> getLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();

		for (int r = loc.getRow() - 2; ) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		return locs;
	}
}