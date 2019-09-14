/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalCheckBoxUI;

/**
 * Provides the Flat LaF UI delegate for {@link javax.swing.JCheckBox}.
 *
 * @author Karl Tauber
 */
public class FlatCheckBoxUI
	extends MetalCheckBoxUI
{
	private static ComponentUI instance;

	public static ComponentUI createUI( JComponent c ) {
		if( instance == null )
			instance = new FlatCheckBoxUI();
		return instance;
	}

	@Override
	public void installDefaults( AbstractButton b ) {
		super.installDefaults( b );

		MigLayoutVisualPadding.install( b, null );
	}

	@Override
	protected void uninstallDefaults( AbstractButton b ) {
		super.uninstallDefaults( b );

		MigLayoutVisualPadding.uninstall( b );
	}

	@Override
	protected void paintFocus( Graphics g, Rectangle t, Dimension d ) {
		// focus border painted in icon
	}
}
