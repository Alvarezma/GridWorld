import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
        for (Actor a : actors)  {
            if(a instanceof Rock)   {
                a.removeSelfFromGrid();
            }
        }
    }
}

