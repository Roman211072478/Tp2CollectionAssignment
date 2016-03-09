/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.test.me.animalcollections.java.AnimalClass;
import java.util.HashSet;
import java.util.Set;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class AnimalSetTest {
    private AnimalClass animalObject;
    
    public AnimalSetTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAnimalSet() {
         Set animalList = new HashSet();
        animalObject = new AnimalClass("snake","female");

        animalList.add(animalObject);
        animalList.add(animalObject);

        Assert.assertEquals(animalList.size(), 1, "A duplicate was added");
        Assert.assertNotNull(animalList);
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
