package freemind.clouds;

import freemind.main.XMLElement;
import freemind.util.Driver;
import freemind.view.mindmapview.NodeView;

public aspect ConcreteDynamicCloudAspect extends AbstractCloudAspect {

	pointcut driver(): if(new Driver().isActivated("cloud"));

	pointcut instanceofCloudAdapter(XMLElement child) : AbstractCloudAspect.instanceofCloudAdapter(child) 
		&& driver();

	pointcut getAdditionalCloudHeight(NodeView node) : AbstractCloudAspect.getAdditionalCloudHeight(node) 
		&& driver();

	Object around() : adviceexecution() && within(freemind.clouds.AbstractCloudAspect) 
		&& !driver() {
		return null;
	}
}
