package com.liferay.frontend.packages.definitions;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;

import java.net.URL;
import java.util.Optional;

import javax.servlet.ServletContext;

public interface PackageInterpreter {

	public String getType();

	public Optional<PackagesBundleConfig> interpret(
		ServiceReference<ServletContext> serviceReference);

}
