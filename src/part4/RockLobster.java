import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;


public class RockLobster extends CrabCritter {

    public RockLobster(Color col) {
		setColor(col);
	}

	public void processActors(ArrayList<Actor> actors)  {
        Location loc;
        Color col;
        for (Actor a : actors)  {
            if (a instanceof Rock)  {
                loc = a.getLocation();
                col = a.getColor();
                a.removeSelfFromGrid();
                RockLobster rocklobster = new RockLobster(col);
                rocklobster.putSelfInGrid(getGrid(), loc);
            }
        }
    }
}
