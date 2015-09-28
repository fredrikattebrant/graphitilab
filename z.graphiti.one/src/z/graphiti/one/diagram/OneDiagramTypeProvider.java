package z.graphiti.one.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class OneDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public OneDiagramTypeProvider() {
		super();
		setFeatureProvider(new OneFeatureProvider(this));
	}
}
