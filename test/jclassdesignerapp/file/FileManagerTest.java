/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclassdesignerapp.file;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javax.json.JsonObject;
import jclassdesignerapp.data.DataManager;
import jclassdesignerapp.data.DraggableRectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import saf.AppTemplate;
import saf.components.AppComponentsBuilder;
import saf.components.AppDataComponent;
import saf.components.AppFileComponent;
import saf.components.AppWorkspaceComponent;

/**
 *
 * @author djp217
 */
public class FileManagerTest {

    
    public FileManagerTest() {
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
     * Test of saveData method, of class FileManager.
     */
    @Test
    public void testSaveData() throws Exception {
        System.out.println("saveData");
 //       AppComponentsBuilder builder = makeAppBuilderHook();
  //      AppDataComponent data = builder.buildDataComponent();
        AppDataComponent data = null;
        AppTemplate app = new AppTemplate() {
            @Override
            public AppComponentsBuilder makeAppBuilderHook() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        AppComponentsBuilder builder = makeAppBuilderHook();
        AppDataComponent data1 = builder.buildDataComponent();
        DataManager datamanager1 = new DataManager(app);
//        DataManager datamanager = (DataManager) data1;
        //DataManager data1 = (DataManager) data;1
        DraggableRectangle s = new DraggableRectangle();
        s.start(500, 500);
        s.setFill(Color.WHITE);
        s.setStroke(Color.BLACK);
//        s.setName("Classname");
//        s.setName2("Packagename");
        datamanager1.addShape(s);
        String filePath = "test_bed1";
        FileManager instance = new FileManager();
        instance.saveData(data1, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeJsonColorObject method, of class FileManager.
     */
    @Test
    public void testMakeJsonColorObject() {
        System.out.println("makeJsonColorObject");
        Color color = null;
        FileManager instance = new FileManager();
        JsonObject expResult = null;
        JsonObject result = instance.makeJsonColorObject(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadData method, of class FileManager.
     */
    @Test
    public void testLoadData() throws Exception {
        System.out.println("loadData");
        AppDataComponent data = null;
        String filePath = "";
        FileManager instance = new FileManager();
        instance.loadData(data, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataAsDouble method, of class FileManager.
     */
    @Test
    public void testGetDataAsDouble() {
        System.out.println("getDataAsDouble");
        JsonObject json = null;
        String dataName = "";
        FileManager instance = new FileManager();
        double expResult = 0.0;
        double result = instance.getDataAsDouble(json, dataName);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadShape method, of class FileManager.
     */
    @Test
    public void testLoadShape() {
        System.out.println("loadShape");
        JsonObject jsonShape = null;
        FileManager instance = new FileManager();
        Shape expResult = null;
        Shape result = instance.loadShape(jsonShape);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadColor method, of class FileManager.
     */
    @Test
    public void testLoadColor() {
        System.out.println("loadColor");
        JsonObject json = null;
        String colorToGet = "";
        FileManager instance = new FileManager();
        Color expResult = null;
        Color result = instance.loadColor(json, colorToGet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportData method, of class FileManager.
     */
    @Test
    public void testExportData() throws Exception {
        System.out.println("exportData");
        AppDataComponent data = null;
        String filePath = "";
        FileManager instance = new FileManager();
        instance.exportData(data, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importData method, of class FileManager.
     */
    @Test
    public void testImportData() throws Exception {
        System.out.println("importData");
        AppDataComponent data = null;
        String filePath = "";
        FileManager instance = new FileManager();
        instance.importData(data, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private AppComponentsBuilder makeAppBuilderHook() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        AppComponentsBuilder c = new AppComponentsBuilder() {
            @Override
            public AppDataComponent buildDataComponent() throws Exception {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                AppDataComponent d = new AppDataComponent() {
                    @Override
                    public void reset() {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                return d;
            }

            @Override
            public AppFileComponent buildFileComponent() throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public AppWorkspaceComponent buildWorkspaceComponent() throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return c;
    }
    
}
