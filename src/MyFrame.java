import javax.swing.JFrame;

public class MyFrame extends JFrame {
DragPanel dragPanel = new DragPanel();
	MyFrame() {
		this.setTitle("Drag and drop demo");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(dragPanel);
		
		
		
		this.setVisible(true);
	}
	
	
	
}

