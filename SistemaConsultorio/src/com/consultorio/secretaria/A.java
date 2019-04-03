//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.border.*;
//public class ConfirmaMusica extends JDialog{
//    private MJPanel mjp; //JPanel personalizado pode ser substituído por um tradicional
//    private String texto;
//    private static Boolean confirm;
//    private JLabel jl1;
//    private JLabel jl2;
//    private JButton jb1;
//    private JButton jb2;
//    private Container c;
//    private Color clBorda = Color.yellow;
//    private LineBorder lBorda = new LineBorder(clBorda, 3 ,true);
//    public ConfirmaMusica(){
//        this.confirm = false;
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setVisible(true);
//        setSize(500,190);
//        setLocation(50,50);
//        c = getContentPane();
//        c.setLayout(null);
//        mjp = new MJPanel();
//        c.add(mjp);
//        mjp.setLayout(null);
//        mjp.setImagem("imagens/fundocm.jpg");
//        mjp.setBounds(0,0,1000, 1000);
//        jl1 = new JLabel("Confirma a música:");
//        mjp.add(jl1);
//        jl1.setBounds(10,10,470,30);
//        jl1.setFont(new Font("Arial", 1, 16));
//        jl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        jl1.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
//        jl2 = new JLabel("PORQUE CHORAS PORQUE CHORAS PORQUE CHORAS");
//        mjp.add(jl2);
//        jl2.setBounds(10,50,470,30);
//        jl2.setFont(new Font("Arial", 1, 16));
//        jl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        jl2.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
//        jb1 = new JButton("");
//        mjp.add(jb1);
//        jb1.setBounds(80,100,120,30);
//        ImageIcon imgb1 = new ImageIcon("imagens/btsim.png"); // [0] é sempre a 1ª imagem
//        ImageIcon imgb12 = new ImageIcon(imgb1.getImage().
//                getScaledInstance(jb1.getWidth(), jb1.getHeight(), Image.SCALE_DEFAULT));
//        jb1.setIcon(imgb12);
//        jb1.addFocusListener(new FocusAdapter() {
//            public void focusGained(FocusEvent evt) {
//                jb1FocusGained(evt);
//            }
//            public void focusLost(FocusEvent evt) {
//                jb1FocusLost(evt);
//            }
//        });
//        jb1.addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent evt) {
//                jb1KeyPressed(evt);
//            }
//            public void keyReleased(KeyEvent evt) {
//                jb1KeyReleased(evt);
//            }
//        });
//        jb1.requestFocus();
//        jb2 = new JButton("");
//        mjp.add(jb2);
//        jb2.setBounds(300,100,120,30);
//        ImageIcon imgb2 = new ImageIcon("imagens/btnao.png"); // [0] é sempre a 1ª imagem
//        ImageIcon imgb22 = new ImageIcon(imgb2.getImage().
//                getScaledInstance(jb1.getWidth(), jb1.getHeight(), Image.SCALE_DEFAULT));
//        jb2.setIcon(imgb22);
//        jb2.addFocusListener(new FocusAdapter() {
//            public void focusGained(FocusEvent evt) {
//                jb2FocusGained(evt);
//            }
//            public void focusLost(FocusEvent evt) {
//                jb2FocusLost(evt);
//            }
//        });
//        jb2.addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent evt) {
//                jb2KeyPressed(evt);
//            }
//            public void keyReleased(KeyEvent evt) {
//                jb2KeyReleased(evt);
//            }
//        });
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            public void windowClosed(java.awt.event.WindowEvent evt) {
//                formWindowClosed(evt);
//            }
//        });
//    }
//    private Boolean formWindowClosed(WindowEvent evt) {                                  
//        return confirm;
//    }
//    private void jb1FocusGained(FocusEvent evt) {                                     
//        jb1.setBorder(lBorda);
//    }
//    private void jb1FocusLost(FocusEvent evt) {                                     
//        jb1.setBorder(null);
//    }
//    private void jb1KeyPressed(KeyEvent evt) {                                     
//        if (evt.getKeyCode() == evt.VK_NUMPAD6) jb2.requestFocus();
//        if (evt.getKeyCode() == evt.VK_NUMPAD5) {
//            this.setConfirm(true);
//            this.dispose();
//        }
//    }
//    private void jb1KeyReleased(KeyEvent evt) {                                     
//    }
//    private void jb2FocusGained(FocusEvent evt) {                                     
//        jb2.setBorder(lBorda);
//    }
//    private void jb2FocusLost(FocusEvent evt) {                                     
//        jb2.setBorder(null);
//    }
//    private void jb2KeyPressed(KeyEvent evt) {                                     
//        if (evt.getKeyCode() == evt.VK_NUMPAD4) jb1.requestFocus();
//        if (evt.getKeyCode() == evt.VK_NUMPAD5) {
//            this.setConfirm(false);
//            this.dispose();
//        }
//    }
//    private void jb2KeyReleased(KeyEvent evt) {                                     
//    }
//    public void setTextoMensagem(String tx){
//        this.texto = tx;
//        jl2.setText(texto);
//    }
//    public void setConfirm(Boolean b){
//        this.confirm = b;
//    }
//    //*********Método que invoco na classe principal*******
//    public static Boolean mostrarConfirm(){
//        new ConfirmaMusica();
//        return confirm;
//    }
//}