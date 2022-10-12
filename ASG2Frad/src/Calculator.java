import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

// SIMPLE CALCULATOR APP
// NAME : FRADERIC
// NIM : 2440094112


public class Calculator extends JFrame implements ActionListener, MouseListener, KeyListener {
	
	JPanel mainPanel, panelAtas,panelBawah;
	
	JTextField textField;
	
	//Button , total 17 button
	JButton nolBut,doubleNolBut, satuBut, duaBut,tigaBut,empatBut,limaBut,
	enamBut,tujuhBut,delapanBut,sembilanBut,equalsBut,komaBut,kaliBut,
	bagiBut,tambahBut,kurangBut,clearBut;
	
	 double angka, angkaDua, hasil;
	 int operation;
	 char key;
	 
	 
	public Calculator(){
		
	
		// Component
		
		mainPanel = new JPanel(new BorderLayout());
		panelAtas = new JPanel();
		panelBawah = new JPanel();
		
		// RESULT TEXT
		textField = new JTextField(15);
		textField.setBounds(0, 40, 200, 150);
	//	textField.setBounds(x, y, width, height);
        textField.setFont(new Font("", Font.BOLD, 26));
       // textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.WHITE);
        textField.addKeyListener(this);
        panelAtas.add(textField);
        
        mainPanel.add(panelAtas, BorderLayout.NORTH);
        
        panelBawah.setLayout(null);
        
        
   // BUTTON
      // baris 1  
      //Button Clear
        clearBut = new JButton("Clear");
        clearBut.setBounds(35, 25, 130, 40);
        clearBut.setFont(new Font(" ", Font.BOLD, 20));
        clearBut.setBackground(Color.red);
        clearBut.setForeground(Color.white);
//    	textField.setBounds(x, y, width, height);
        clearBut.addActionListener(this);
        clearBut.addMouseListener(this);
        panelBawah.add(clearBut);
        
        
        
      //Button bagi
        bagiBut = new JButton("/");
        bagiBut.setBounds(175, 25, 60, 40);
//    	textField.setBounds(x, y, width, height);
        bagiBut.setFont(new Font("", Font.BOLD, 20));
        bagiBut.setBackground(Color.decode("#344CB7"));
        bagiBut.setForeground(Color.white);
        bagiBut.addActionListener(this);
        bagiBut.addMouseListener(this);
        panelBawah.add(bagiBut);
        
        
        
        
        tujuhBut = new JButton("7");
        tujuhBut.setBounds(35, 90, 60, 40);
       // tujuhBut.setBorder(new EmptyBorder(50, 5, 50, 50));
       // tujuhBut.setBorder(new EmptyBorder(top, left, bottom, right));
        
        tujuhBut.setFont(new Font("times", Font.BOLD, 20));
        tujuhBut.addActionListener(this);
        tujuhBut.addMouseListener(this);
        panelBawah.add(tujuhBut);
        
        delapanBut = new JButton("8");
        delapanBut.setBounds(105, 90, 60, 40);
        delapanBut.setFont(new Font(" ", Font.BOLD, 20));
        delapanBut.addActionListener(this);
        delapanBut.addMouseListener(this);
        panelBawah.add(delapanBut);
        
        sembilanBut = new JButton("9");
        sembilanBut.setBounds(175, 90, 60, 40);
        sembilanBut.setFont(new Font(" ", Font.BOLD, 20));
        sembilanBut.addActionListener(this);
        sembilanBut.addMouseListener(this);
        panelBawah.add(sembilanBut);

        
        // Baris 2
        empatBut = new JButton("4");
        empatBut.setBounds(35, 150, 60, 40);
        empatBut.setFont(new Font(" ", Font.BOLD, 20));
        empatBut.addActionListener(this);
        empatBut.addMouseListener(this);
        panelBawah.add(empatBut);

        
        limaBut = new JButton("5");
        limaBut.setBounds(105, 150, 60, 40);
        limaBut.setFont(new Font(" ", Font.BOLD, 20));
        limaBut.addActionListener(this);
        limaBut.addMouseListener(this);
        panelBawah.add(limaBut);

        enamBut = new JButton("6");
        enamBut.setBounds(175, 150, 60, 40);
        enamBut.setFont(new Font(" ", Font.BOLD, 20));
        enamBut.addActionListener(this);
        enamBut.addMouseListener(this);
        panelBawah.add(enamBut);

        
        //Baris 3
        satuBut = new JButton("1");
        satuBut.setBounds(35, 210, 60, 40);
        satuBut.setFont(new Font(" ", Font.BOLD, 20));
        satuBut.addActionListener(this);
        satuBut.addMouseListener(this);
        panelBawah.add(satuBut);

        duaBut = new JButton("2");
        duaBut.setBounds(105, 210, 60, 40);
        duaBut.setFont(new Font(" ", Font.BOLD, 20));
        duaBut.addActionListener(this);
        duaBut.addMouseListener(this);
        panelBawah.add(duaBut);

        tigaBut = new JButton("3");
        tigaBut.setBounds(175, 210, 60, 40);
        tigaBut.setFont(new Font(" ", Font.BOLD, 20));
        tigaBut.addActionListener(this);
        tigaBut.addMouseListener(this);
        panelBawah.add(tigaBut);

        
        // Baris 4
        
        nolBut = new JButton("0");
        nolBut.setBounds(35, 270, 60, 40);
        nolBut.setFont(new Font(" ", Font.BOLD, 20));
        nolBut.addActionListener(this);
        nolBut.addMouseListener(this);
        panelBawah.add(nolBut);
        
        
        komaBut = new JButton(".");
        komaBut.setBounds(175, 270, 60, 40);
        komaBut.setFont(new Font(" ", Font.BOLD, 20));
        komaBut.addActionListener(this);
        komaBut.addMouseListener(this);
        panelBawah.add(komaBut);
  
 
        doubleNolBut = new JButton("00");
        doubleNolBut.setBounds(105, 270, 60, 40);
        doubleNolBut.setFont(new Font(" ", Font.BOLD, 20));
//    	textField.setBounds(x, y, width, height);
        doubleNolBut.addActionListener(this);
        doubleNolBut.addMouseListener(this);
        panelBawah.add(doubleNolBut);


        //kolom 4
        
        kaliBut = new JButton("*");
        kaliBut.setBounds(245, 25, 60, 40);
        kaliBut.setFont(new Font(" ", Font.BOLD, 20));
        kaliBut.setBackground(Color.decode("#344CB7"));
        kaliBut.setForeground(Color.white);
        kaliBut.addActionListener(this);
        kaliBut.addMouseListener(this);
        
        panelBawah.add(kaliBut);
       // 
        tambahBut = new JButton("+");
        tambahBut.setBounds(245, 150, 60, 40);
        tambahBut.setFont(new Font(" ", Font.BOLD, 20));
        tambahBut.setBackground(Color.decode("#344CB7"));
        tambahBut.setForeground(Color.white);
        tambahBut.addActionListener(this);
        tambahBut.addMouseListener(this);
        panelBawah.add(tambahBut);
        
        kurangBut = new JButton("-");
        kurangBut.setBounds(245, 90, 60, 40);
        kurangBut.setFont(new Font(" ", Font.BOLD, 20));
        kurangBut.setBackground(Color.decode("#344CB7"));
        kurangBut.setForeground(Color.white);
        kurangBut.addActionListener(this);
        kurangBut.addMouseListener(this);
        panelBawah.add(kurangBut);

       
        equalsBut = new JButton("=");
        equalsBut.setBounds(245, 210, 60, 100);
        equalsBut.setFont(new Font(" ", Font.BOLD, 20));
        equalsBut.setBackground(Color.decode("#344CB7"));
        equalsBut.setForeground(Color.white);
        equalsBut.addActionListener(this);
        equalsBut.addMouseListener(this);
        panelBawah.add(equalsBut);

        
        mainPanel.add(panelBawah, BorderLayout.CENTER);

        
        add(mainPanel);
		// Frame
		setTitle("Calculator");
		setVisible(true);
		setSize(375,420);
		setResizable(false);
		setLocationRelativeTo(null);
		//this.addKeyListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Calculator();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == clearBut) {
			 textField.setText("");
			 
			 
		} else if (e.getSource() == nolBut) {
			textField.setText(textField.getText() + "0");
			return;
		} 
		
		else if (e.getSource() == doubleNolBut) {
			textField.setText(textField.getText() + "00");
			return;
		} 
		
		else if (e.getSource() == satuBut) {
			textField.setText(textField.getText() + "1");
			return;
		} 
		
		else if (e.getSource() == duaBut) {
			textField.setText(textField.getText() + "2");
			return;
		} 
		
		else if (e.getSource() == tigaBut) {
			textField.setText(textField.getText() + "3");
			return;
		} 
		
		else if (e.getSource() == empatBut) {
			textField.setText(textField.getText() + "4");
			return;
		} 
		
		else if (e.getSource() == limaBut) {
			textField.setText(textField.getText() + "5");
			return;
		} 
		
		else if (e.getSource() == enamBut) {
			textField.setText(textField.getText() + "6");
			return;
		} 
		
		else if (e.getSource() == tujuhBut) {
			textField.setText(textField.getText() + "7");
			return;
		} 
		
		else if (e.getSource() == delapanBut) {
			textField.setText(textField.getText() + "8");
			return;
		} 
		
		else if (e.getSource() == sembilanBut) {
			textField.setText(textField.getText() + "9");
			return;
		} 
		
		
		//OPERATION
		//equalsBut,komaBut,kaliBut,
		
		else if (e.getSource() == komaBut) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
 
        }
		
		// BAGI
		else if (e.getSource() == bagiBut) {
            angka = Double.parseDouble(textField.getText());
           // textField.setText(textField.getText() + "/");
            textField.setText("");
           // textField.setText(value + "/");

            
            
            textField.setText("");
            operation = 1;
            
       // KALI
		} else if (e.getSource() == kaliBut) {
            //String value = textField.getText();
            angka = Double.parseDouble(textField.getText());
            textField.setText("");
            
            
            
            // textField.setText(textField.getText() + "*");
            
            operation = 2;
            
		}
		
		// KURANG
		else if (e.getSource() == kurangBut) {
           // String value = textField.getText();
            angka = Double.parseDouble(textField.getText());
            textField.setText("");
//            textField.setText(value + "-");
            
          //  textField.setText(textField.getText() + "-");
            
            operation = 3;
            
		}
		//TAMBAH
		else if (e.getSource() == tambahBut) {
//            String value = textField.getText();
            angka = Double.parseDouble(textField.getText());
            textField.setText("");
//            textField.setText(value + "+");
            
            operation = 4;
            
		}
		// SAMA DENGAN
		
		//JOptionPane.showMessageDialog(this,"Wrong Password !","Error",JOptionPane.ERROR_MESSAGE);
		
		else if (e.getSource() == equalsBut) {
			//angkaDua = Double.parseDouble(textField.getText());
			
            switch (operation) {
			case 1:// BAGI
				hasil = angka / Double.parseDouble(textField.getText());
				
				textField.setText(Double.toString(hasil));
				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
                 
				break;

			case 2://KALI
				hasil = angka * Double.parseDouble(textField.getText());
				
				textField.setText(Double.toString(hasil));
				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
				
				break;
				
			case 3://KURANG
				
				hasil = angka - Double.parseDouble(textField.getText());
				
				textField.setText(Double.toString(hasil));
				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
				
				break;
				
			case 4://TAMBAH
				
				hasil = angka + Double.parseDouble(textField.getText());
				
				textField.setText(Double.toString(hasil));
				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
				
				break;
			}
            
		}
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		 
		if (e.getSource() == nolBut) {
			nolBut.setBackground(Color.ORANGE);
			}
		
		else if (e.getSource() == doubleNolBut) {
			doubleNolBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == satuBut) {
			satuBut.setBackground(Color.ORANGE); 
		}
		
		else if (e.getSource() == duaBut) {
			 duaBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == tigaBut) {
			tigaBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == empatBut) {
			 empatBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == limaBut) {
			 limaBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == enamBut) {
			enamBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == tujuhBut) {
			tujuhBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == delapanBut) {
			delapanBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == sembilanBut) {
			sembilanBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == equalsBut) {
			equalsBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == komaBut) {
			komaBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == kaliBut) {
			kaliBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == bagiBut) {
			bagiBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == tambahBut) {
			 tambahBut.setBackground(Color.ORANGE);
		}
		
		else if (e.getSource() == kurangBut) {
			kurangBut.setBackground(Color.ORANGE);
		}
		 
		else if (e.getSource() == clearBut) {
			clearBut.setBackground(Color.ORANGE);
		}
		 
		 
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		 nolBut.setBackground(null);
		 
		 doubleNolBut.setBackground(null);
		 satuBut.setBackground(null); 
		 duaBut.setBackground(null);
		 tigaBut.setBackground(null);
		 empatBut.setBackground(null);
		 limaBut.setBackground(null);
		 enamBut.setBackground(null);
		 tujuhBut.setBackground(null);
		 delapanBut.setBackground(null);
		 sembilanBut.setBackground(null);
		 equalsBut.setBackground(Color.decode("#344CB7"));
		 komaBut.setBackground(null);
		 kaliBut.setBackground(Color.decode("#344CB7"));
		 bagiBut.setBackground(Color.decode("#344CB7"));
		 tambahBut.setBackground(Color.decode("#344CB7"));
		 kurangBut.setBackground(Color.decode("#344CB7"));
		 clearBut.setBackground(Color.red);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
//		if (e.getKeyChar() = '/') {
//			
//		}
		
		char x;
		x = e.getKeyChar();
		
		if (x=='/') {
			angka = Double.parseDouble(textField.getText());
			operation = 1;
			textField.setText("");
		} 
		
		else if (x=='*') {
			angka = Double.parseDouble(textField.getText());
			operation = 2;
			textField.setText("");
		}
		
		else if (x=='-') {
			angka = Double.parseDouble(textField.getText());
			operation = 3;
			textField.setText("");
		}
		
		else if (x=='+') {
			angka = Double.parseDouble(textField.getText());
			operation = 4;
			textField.setText("");
		}
		
//		switch (e.getKeyChar()) {
//		case '/':// BAGI
//			
//			angka = Double.parseDouble(textField.getText());
//	        textField.setText("");
//	        
//	        // glmbg kedua nya
//			
//	        if (!textField.getText().contains("")) {
//	        	hasil = angka / Double.parseDouble(textField.getText());
//	 			
//	 			textField.setText(Double.toString(hasil));
//	 			JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//	 			textField.setText("");
//			}
//	        
//	        	textField.setText("");	
//	        
//			break;
//
//		case '*'://KALI
//			
//			angka = Double.parseDouble(textField.getText());
//	        textField.setText("");
//			
//			if (!textField.getText().contains("")) {
//				hasil = angka * Double.parseDouble(textField.getText());
//			
//				textField.setText(Double.toString(hasil));
//				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//				textField.setText("");
//			}
//			textField.setText("");
//			
//			break;
//			
//			
//			
//		case '-'://KURANG
//			
//			angka = Double.parseDouble(textField.getText());
//	        textField.setText("");
//			
//			if (!textField.getText().contains("")) {
//				hasil = angka - Double.parseDouble(textField.getText());
//			
//				textField.setText(Double.toString(hasil));
//				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//				textField.setText("");
//			}
//			
//			textField.setText("");
//			
//			break;
//			
//		case '+'://TAMBAH
//			
//			angka = Double.parseDouble(textField.getText());
//	        textField.setText("");
//			
//			if (!textField.getText().contains("")) {
//				hasil = angka + Double.parseDouble(textField.getText());
//			
//				textField.setText(Double.toString(hasil));
//				JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//				textField.setText("");
//				
//			}
//			textField.setText("");
//			
//			break;
//		}
//		
		
			textField.setText("");
			
			if (e.getSource() == equalsBut) {
				//angkaDua = Double.parseDouble(textField.getText());
				
	            switch (operation) {
				case 1:// BAGI
					hasil = angka / Double.parseDouble(textField.getText());
					
					textField.setText(Double.toString(hasil));
					JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
	                 
					break;

				case 2://KALI
					hasil = angka * Double.parseDouble(textField.getText());
					
					textField.setText(Double.toString(hasil));
					JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
					
					break;
					
				case 3://KURANG
					
					hasil = angka - Double.parseDouble(textField.getText());
					
					textField.setText(Double.toString(hasil));
					JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
					
					break;
					
				case 4://TAMBAH
					
					hasil = angka + Double.parseDouble(textField.getText());
					
					textField.setText(Double.toString(hasil));
					JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
					
					break;
				}
	            
			}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
//		char x;
//		x = e.getKeyChar();
//		
//		if (x=='*') {
//			operation = 2;
//			textField.setText("");
//			
//		}
		
//		switch (e.getKeyCode()) {
//		case 111 :// BAGI
//			hasil = angka / Double.parseDouble(textField.getText());
//			
//			textField.setText(Double.toString(hasil));
//			JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//			textField.setText("");
//             
//			break;
//
//		case 106://KALI
//			hasil = angka * Double.parseDouble(textField.getText());
//			
//			textField.setText(Double.toString(hasil));
//			JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//			textField.setText("");
//			
//			break;
//			
//		case 109://KURANG
//			
//			hasil = angka - Double.parseDouble(textField.getText());
//			
//			textField.setText(Double.toString(hasil));
//			JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//			textField.setText("");
//			
//			break;
//			
//		case 107://TAMBAH
//			
//			hasil = angka + Double.parseDouble(textField.getText());
//			
//			textField.setText(Double.toString(hasil));
//			JOptionPane.showMessageDialog(this,"Hasilnya adalah: " + textField.getText(),"HASILNYA ADALAH",JOptionPane.INFORMATION_MESSAGE);
//			textField.setText("");
//			
//			break;
//		}
		
	      
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("KeyChar: "+e.getKeyChar());
//		System.out.println("KeyCode: "+e.getKeyCode());
		
	}

}
