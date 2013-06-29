package freemind.icons;

import freemind.util.Driver;
import freemind.view.mindmapview.EditNodeTextField;

public aspect ConcreteDynamicIconsAspect extends AbstractIconsAspect {

	pointcut driver(): if(new Driver().isActivated("icons"));
	
	pointcut getIcons(EditNodeTextField cthis) : AbstractIconsAspect.getIcons(cthis) 
		&& driver();

	pointcut linkIconWidth(EditNodeTextField cthis, int xOffset,
			int linkIconWidth) 
	 : AbstractIconsAspect.linkIconWidth(cthis, xOffset, linkIconWidth) 
	 	&& driver();

	Object around() : adviceexecution() && within(freemind.icons.AbstractIconsAspect) 
		&& !driver() {
		return null;
	}
}
