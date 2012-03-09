import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;


public class MainGame extends SimpleApplication{

	@Override
	public void simpleInitApp() {
		
		cam.setLocation(new Vector3f(0.0f, 0.0f, 2.0f));
		cam.setFrustumPerspective(60.0f, 1.3333f, 0.01f, 200.0f);
		
		Box b = new Box(Vector3f.ZERO, 1.0f, 0.1f, 0.1f); // create cube shape at the origin
        Geometry geom = new Geometry("Box", b);  // create cube geometry from the shape
        Material mat = new Material(assetManager,
          "Common/MatDefs/Misc/SolidColor.j3md");  // create a simple material
        mat.setColor("m_Color", ColorRGBA.Red);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
        
        b = new Box(Vector3f.ZERO, 0.1f, 1.0f, 0.1f); // create cube shape at the origin
        geom = new Geometry("Box", b);  // create cube geometry from the shape
        mat = new Material(assetManager,
          "Common/MatDefs/Misc/SolidColor.j3md");  // create a simple material
        mat.setColor("m_Color", ColorRGBA.Blue);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
        
        b = new Box(Vector3f.ZERO, 0.1f, 0.1f, 1.0f); // create cube shape at the origin
        geom = new Geometry("Box", b);  // create cube geometry from the shape
        mat = new Material(assetManager,
          "Common/MatDefs/Misc/SolidColor.j3md");  // create a simple material
        mat.setColor("m_Color", ColorRGBA.Green);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
        
        
        VoxelData voxel = new VoxelData();
        voxel.Reconstruct();
        Geometry geo = new Geometry("VoxelMesh", voxel);
        mat = new Material(assetManager, "Common/MatDefs/Misc/WireColor.j3md");
        mat.setColor("m_Color", ColorRGBA.White);
        geo.setMaterial(mat);
        rootNode.attachChild(geo);
	}
	
	public static void main(String[] args){
		MainGame app = new MainGame();
        app.start(); // start the game
    }
}


