package org.openntf.uikittemplate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Navigation implements Serializable {

	private static final long serialVersionUID = 8031965383531253276L;
	private final List<Page> navigation;

	public Navigation() {
		this.navigation = new ArrayList<Page>();
		this.navigation.add(new Page("Samples", "samples.xsp", "glyphicon glyphicon-star", false));
		this.navigation.add(new Page("Bootstrap CKE", "bscke.xsp", "glyphicon glyphicon-star", false));
	}

	public List<Page> getNavigation() {
		return navigation;
	}
}
