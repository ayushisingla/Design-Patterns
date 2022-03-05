package behavioral.observer;

public class Test {

	public static void main(String[] args) {
		// create objects for testing
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		// pass the displays to Cricket data
		CricketData cricketData = new CricketData();

		// register display elements
		cricketData.registerObserver(averageScoreDisplay);
		cricketData.registerObserver(currentScoreDisplay);

		cricketData.dataChanged();

		// remove an observer
		cricketData.unregisterObserver(averageScoreDisplay);

		cricketData.dataChanged();
	}

}
