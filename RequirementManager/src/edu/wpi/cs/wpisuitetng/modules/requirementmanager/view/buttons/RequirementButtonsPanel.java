/*******************************************************************************
 * Copyright (c) 2013 WPI-Suite
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Team Rolling Thunder
 ******************************************************************************/
package edu.wpi.cs.wpisuitetng.modules.requirementmanager.view.buttons;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

<<<<<<< HEAD
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
=======
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
>>>>>>> 0ab84756ec22bafa8be2cef9c4da6afdb52cff81
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.ToolbarGroupView;
import edu.wpi.cs.wpisuitetng.modules.requirementmanager.view.ViewEventController;

/**
 * @author justinhess
 * @version $Revision: 1.0 $
 */
public class RequirementButtonsPanel extends ToolbarGroupView{
	
	// initialize the main view toolbar buttons
		private JButton createButton = new JButton("<html>Create<br />Requirement</html>");
		
		private final JButton createIterationButton = new JButton("<html>Create<br />Iteration</html>");
		private final JPanel contentPanel = new JPanel();
	
	public RequirementButtonsPanel(){
		super("");
		
		this.contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
		this.setPreferredWidth(350);
		
<<<<<<< HEAD
		//this.createIterationButton.setSize(200, 200);
		//this.createButton.setPreferredSize(new Dimension(200, 200));
		this.createButton.setHorizontalAlignment(SwingConstants.CENTER);
		try {
		    Image img = ImageIO.read(getClass().getResource("new_req.png"));
		    this.createButton.setIcon(new ImageIcon(img));
		    
		    img = ImageIO.read(getClass().getResource("new_itt.png"));
		    this.createIterationButton.setIcon(new ImageIcon(img));
		    
		} catch (IOException ex) {}
		
=======
		createButton.setIcon(new ImageIcon("../RequirementManager/resources/new-requirement-icon.png"));
		createButton.setHorizontalTextPosition(AbstractButton.CENTER);
		createButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		
		createIterationButton.setIcon(new ImageIcon("../RequirementManager/resources/new-iteration-icon.png"));
		createIterationButton.setHorizontalTextPosition(AbstractButton.CENTER);
		createIterationButton.setVerticalTextPosition(AbstractButton.BOTTOM);

>>>>>>> 0ab84756ec22bafa8be2cef9c4da6afdb52cff81
		// the action listener for the Create Requirement Button
		createButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// bring up a create requirement pane if not in Multiple Requirement Editing Mode
				//if (!ViewEventController.getInstance().getOverviewTable().getEditFlag()) {
					ViewEventController.getInstance().createRequirement();
			//	}
			}
		});		
		
		//action listener for the Create Iteration Button
		createIterationButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//if (!ViewEventController.getInstance().getOverviewTable().getEditFlag()) {
					ViewEventController.getInstance().createIteration();
				}
		//	}
		});
			
		contentPanel.add(createButton);
		contentPanel.add(createIterationButton);
		contentPanel.setOpaque(false);
		
<<<<<<< HEAD
		this.add(contentPanel);
=======
		toolbarLayout.putConstraint(SpringLayout.WEST, createButton, 15,SpringLayout.WEST, this);
		toolbarLayout.putConstraint(SpringLayout.WEST, createIterationButton, 30, SpringLayout.EAST, createButton);
		
		this.add(createButton);
		this.add(createIterationButton);
>>>>>>> 0ab84756ec22bafa8be2cef9c4da6afdb52cff81
	}
	/**
	 * Method getCreateButton.
	
	 * @return JButton */
	public JButton getCreateButton() {
		return createButton;
	}

	/**
	 * Method getCreateIterationButton.
	
	 * @return JButton */
	public JButton getCreateIterationButton() {
		return createIterationButton;
	}

	
}
