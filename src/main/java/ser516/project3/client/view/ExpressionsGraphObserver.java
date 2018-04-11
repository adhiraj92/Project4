package ser516.project3.client.view;

import java.util.Observable;
import java.util.Observer;

import ser516.project3.client.controller.GraphController;
import ser516.project3.model.ExpressionsDataObservable;
import ser516.project3.factory.ControllerFactory;

/**
 * 
 * On receiving new data in ExpressionsDataObservable object update function of
 * this class can be used to update corresponding UI elements
 * 
 * @author Manish Tandon
 *
 */
public class ExpressionsGraphObserver implements Observer {

	@Override
	public void update(Observable observable, Object observerObj) {
		ExpressionsDataObservable expressionsDataObservable = (ExpressionsDataObservable) observable;

		GraphController graphController = ControllerFactory.getInstance().getExpressionsGraphController();

		graphController.setGraphData(expressionsDataObservable.getExpressionsData());
		graphController.setNoOfChannels(12);
		graphController.updateGraphView();
	}

}
