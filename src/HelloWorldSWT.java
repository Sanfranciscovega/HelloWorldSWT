import org.eclipse.swt.widgets.*;


public class HelloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Display display = new Display();
	//Menu menu;
	//set menu=new Menu();
	Shell shell = new Shell(display);
	//org.eclipse.swt.widgets.Event event;
	shell.setText("Hello world!");
	shell.setLocation(12, 15);
	shell.setAlpha(250);
	shell.setBounds(12, 100, 1500, 150);
	//menu=display.getSystemMenu();
	shell.open();
	while (!shell.isDisposed()) {
	if (!display.readAndDispatch()) display.sleep();
	}
	display.dispose();
	}

}
//