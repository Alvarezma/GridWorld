import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter {
	public void processActors(ArrayList<Actor> actors)  {
        Location loc = getLocation();
        Grid gr = getGrid();
        for (Actor a : actors)  {
            int d = loc.getDirectionToward(a.getLocation());
            Location potentialLoc = a.getLocation().getAdjacentLocation(d);
            if (gr.isValid(potentialLoc) && gr.get(potentialLoc) == null)   {
                a.moveTo(potentialLoc);
            } else  {
                a.removeSelfFromGrid();
            }
        }
    }
}
