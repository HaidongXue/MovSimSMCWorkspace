package movSimSMC;

import java.util.Random;

public interface GlobalConstants
{
	int RANDOM_SEED = 12345;
	Random G_RAND = new Random(RANDOM_SEED);
	boolean TRANSITION_MOVE_RANDOMNESS = false;
	double TRANSITION_ACCIDENT_RATE = 0.1;
	boolean SHOW_FIG = true;
}
