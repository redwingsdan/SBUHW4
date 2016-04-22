/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclassdesignerapp.gui;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author djp217
 */
public class WorkspaceTest {
    
    public WorkspaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFillColorPicker method, of class Workspace.
     */
    @Test
    public void testGetFillColorPicker() {
        System.out.println("getFillColorPicker");
        Workspace instance = null;
        ColorPicker expResult = null;
        ColorPicker result = instance.getFillColorPicker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutlineColorPicker method, of class Workspace.
     */
    @Test
    public void testGetOutlineColorPicker() {
        System.out.println("getOutlineColorPicker");
        Workspace instance = null;
        ColorPicker expResult = null;
        ColorPicker result = instance.getOutlineColorPicker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackgroundColorPicker method, of class Workspace.
     */
    @Test
    public void testGetBackgroundColorPicker() {
        System.out.println("getBackgroundColorPicker");
        Workspace instance = null;
        ColorPicker expResult = null;
        ColorPicker result = instance.getBackgroundColorPicker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutlineThicknessSlider method, of class Workspace.
     */
    @Test
    public void testGetOutlineThicknessSlider() {
        System.out.println("getOutlineThicknessSlider");
        Workspace instance = null;
        Slider expResult = null;
        Slider result = instance.getOutlineThicknessSlider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initChildButton method, of class Workspace.
     */
    @Test
    public void testInitChildButton() {
        System.out.println("initChildButton");
        Pane toolbar = null;
        String icon = "";
        String tooltip = "";
        boolean disabled = false;
        Workspace instance = null;
        Button expResult = null;
        Button result = instance.initChildButton(toolbar, icon, tooltip, disabled);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDebugText method, of class Workspace.
     */
    @Test
    public void testSetDebugText() {
        System.out.println("setDebugText");
        String text = "";
        Workspace instance = null;
        instance.setDebugText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCanvas method, of class Workspace.
     */
    @Test
    public void testGetCanvas() {
        System.out.println("getCanvas");
        Workspace instance = null;
        Pane expResult = null;
        Pane result = instance.getCanvas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Workspace.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ButtonBase button = null;
        String fileName = "";
        Workspace instance = null;
        instance.setImage(button, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initStyle method, of class Workspace.
     */
    @Test
    public void testInitStyle() {
        System.out.println("initStyle");
        Workspace instance = null;
        instance.initStyle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reloadWorkspace method, of class Workspace.
     */
    @Test
    public void testReloadWorkspace() {
        System.out.println("reloadWorkspace");
        Workspace instance = null;
        instance.reloadWorkspace();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSelectedShapeSettings method, of class Workspace.
     */
    @Test
    public void testLoadSelectedShapeSettings() {
        System.out.println("loadSelectedShapeSettings");
        Shape shape = null;
        Workspace instance = null;
        instance.loadSelectedShapeSettings(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
