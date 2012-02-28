package com.eyecreate;

import java.io.File;
import java.util.List;

import android.app.Activity;
import android.content.res.AssetManager;

public interface Project {

	public abstract boolean isValid();

	public abstract List<File> getProjectFiles();

	public abstract ProjectTypes getProjectType();
	
	public abstract String getProjectName();
	
	public abstract File getProjectDir();
	
	public abstract void triggerProjectStateSave();
	
	public abstract boolean runProject(Activity activity);

}