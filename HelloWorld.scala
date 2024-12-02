import javax.swing._
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

@main def helloWorld(): Unit = {
  // Define a function to create the GUI components
  val createGui: () => Unit = () => {
    // Create the main frame
    val frame = new JFrame("Hello World")
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    frame.setSize(400, 200)

    // Create a label
    val label = new JLabel("Click the button to see a message!")
    label.setHorizontalAlignment(SwingConstants.CENTER)

    // Create a button
    val button = new JButton("Click Me")
    button.addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {
        label.setText("Hello, World!")
      }
    })

    // Add components to the frame
    val panel = new JPanel()
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS))
    panel.add(label)
    panel.add(button)

    frame.getContentPane.add(panel)
    frame.setVisible(true)
  }

  // Call the function to create and display the GUI
  createGui()
}
