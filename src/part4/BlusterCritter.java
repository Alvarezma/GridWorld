import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter {

	private static final double COLOR_CHANGE_FACTOR = 0.05;
    private int c;

    public BlusterCritter(int c) {
		super();
        this.c = c;
	}

    public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		for (Location loc : getLocationsWithinTwoSteps()) {
			Actor a = getGrid().get(loc);
			if (a instanceof Critter)
				actors.add(a);
		}

		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
        if (actors.size() < c)	{
			brighten();
		} else	{
			darken();
		}
    }

	private void brighten()	{
		Color c = getColor();
		int red = (int)(c.getRed() * (1 + COLOR_CHANGE_FACTOR));
		int green = (int)(c.getGreen() * (1 + COLOR_CHANGE_FACTOR));
		int blue = (int)(c.getBlue() * (1 + COLOR_CHANGE_FACTOR));
		if (red > 255)	{
			red = 255;
		}
		if (green > 255)	{
			green = 255;
		}
		if (blue > 255)	{
			blue = 255;
		}

		setColor(new Color(red, green, blue));
	}

	private void darken()	{
		Color c = getColor();
		int red = (int)(c.getRed() * (1 - COLOR_CHANGE_FACTOR));
		int green = (int)(c.getGreen() * (1 - COLOR_CHANGE_FACTOR));
		int blue = (int)(c.getBlue() * (1 - COLOR_CHANGE_FACTOR));

		setColor(new Color(red, green, blue));
	}

    public ArrayList<Location> getLocationsWithinTwoSteps() {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		Location tempLoc;
		locs.add(gr.getValidAdjacentLocations(loc));

		for (int d = 0; d < 360; d += 45)	{
			if (gr.isValid(loc.getAdjacentLocation(d).getAdjacentLocation(d)))
				locs.add(loc.getAdjacentLocation(d).getAdjacentLocation(d));
			if (d % 90 == 0)	{
				if (gr.isValid(loc.getAdjacentLocation(d).getAdjacentLocation(d + 45)))
					locs.add(loc.getAdjacentLocation(d).getAdjacentLocation(d + 45));
				if (gr.isValid(loc.getAdjacentLocation(d).getAdjacentLocation(d - 45)))
					locs.add(loc.getAdjacentLocation(d).getAdjacentLocation(d - 45));
			}
		}
		return locs;
	}
}