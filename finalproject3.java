package project3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.SystemColor;
 
class gallery1
{
	private String title=null;
	private String annotation=null;
	private String imagepath=null;
 
 public String temp=null;
	public String get_annotation()
	{
		temp=annotation;
		return temp;
	}
 
	public String get_title()
	{
		temp=title;
		return temp;
	}
 
	public String get_imagepath()
	{
		temp=imagepath;
		return temp;
	}
}
public class finalproject3 {

	private final JFileChooser file = new JFileChooser(); 
	private final JFrame frame=new JFrame();
	private final JPanel Data = new JPanel();
	final JPanel panel1 = new JPanel();
	final JPanel panel2 = new JPanel();
	final JPanel panel3 = new JPanel();
	final JPanel panel4 = new JPanel();
	final JPanel panel5 = new JPanel();
	final JPanel panel6 = new JPanel();
	final JPanel panel7 = new JPanel();
	final JPanel panel8 = new JPanel();
	final JPanel panel9 = new JPanel();
	final JPanel panel10 = new JPanel();
	
	static int count=0;
	 /*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalproject3 window = new finalproject3();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ImageIcon ResizeImage(String ImagePath,JLabel label) 
	{ 
		ImageIcon MyImage = new ImageIcon(ImagePath); 
		Image img = MyImage.getImage(); 
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon image = new ImageIcon(newImg); 
		return image; 
		
	}
		
	/**
	 * Create the frame.
	 */
	public String title=null;
	public String annotation=null;
	public String imagepath=null;
	private final JPanel dtitles = new JPanel();
	private final JButton btnMenu = new JButton("MENU");
	private final JButton btnNext = new JButton("NEXT");
	private final JButton btnPrevious = new JButton("PREVIOUS");
	private final JButton btnMenu_1 = new JButton("MENU");
	private final JButton btnNext_1 = new JButton("NEXT");
	private final JButton btnNext_5 = new JButton("NEXT");
	private final JButton btnNext_6 = new JButton("NEXT");
	private final JButton btnNext_7 = new JButton("NEXT");
	private final JButton btnNext_8 = new JButton("NEXT");
	private final JButton btnNext_4 = new JButton("NEXT");
	private final JButton btnNext_3 = new JButton("NEXT");
	private final JButton btnNext_2 = new JButton("NEXT");
	private final JButton btnPrevious_5 = new JButton("PREVIOUS");
	private final JButton btnPrevious_6 = new JButton("PREVIOUS");
	private final JButton btnPrevious_7 = new JButton("PREVIOUS");
	private final JButton btnPrevious_8 = new JButton("PREVIOUS");
	private final JButton btnPrevious_4 = new JButton("PREVIOUS");
	private final JButton btnPrevious_3 = new JButton("PREVIOUS");
	private final JButton btnPrevious_2 = new JButton("PREVIOUS");
	private final JButton btnPrevious_1 = new JButton("PREVIOUS");
	private final JButton btnMenu_6 = new JButton("MENU");
	private final JButton btnMenu_2 = new JButton("MENU");
	private final JButton btnMenu_3 = new JButton("MENU");
	private final JButton btnMenu_4 = new JButton("MENU");
	private final JButton btnMenu_5 = new JButton("MENU");
	private final JButton btnMenu_9 = new JButton("MENU");
	private final JButton btnMenu_8 = new JButton("MENU");
	private final JButton btnMenu_7 = new JButton("MENU");
	private final JButton btnExit = new JButton("EXIT");
	
	public finalproject3() throws IOException {
		
		

		 
		
	    frame.setBounds(100, 100, 900, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));
        
        frame.setVisible(true); 
		Data.setForeground(Color.WHITE);
		Data.setBackground(Color.WHITE);
        
		
		
		frame.getContentPane().add(Data, "name_178188736747861");
		Data.setLayout(null);
		Data.setVisible(false);
		
		
		
		JButton btnNewButton = new JButton("UPLOAD");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Data.setVisible(false);
			    
				JLabel label=new JLabel();
				
			    label.setHorizontalAlignment(SwingConstants.CENTER);
		        label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		        label.setBounds(100, 200, 300, 300);
				
		        
				file.setCurrentDirectory(new File(System.getProperty("user.home"))); //filter the files 
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png"); 
				file.addChoosableFileFilter(filter); 
				int result = file.showSaveDialog(null); //if the user click on save in 
				if(result == JFileChooser.APPROVE_OPTION)
				{ 
					  File selectedFile = file.getSelectedFile(); 
					  String path = selectedFile.getAbsolutePath(); 
					  label.setIcon(ResizeImage(path,label)); 
					  String qwe=JOptionPane.showInputDialog("Enter the annotation");
					  while(qwe.length()>100)
					  {
						  JOptionPane.showMessageDialog(frame,"Annotation length >100 char enter again");
						  qwe=(JOptionPane.showInputDialog("Enter the annotation"));
					  }
					  JLabel annotation=new JLabel("Annotation:"+qwe);
					 
					  annotation.setFont(new Font("Tahoma", Font.BOLD, 16));
				      annotation.setBounds(100, 100,300,50);
				      
				      qwe=JOptionPane.showInputDialog("Enter the title of this Image");
					  
					  while(qwe.length()>20)
					  {
						  JOptionPane.showMessageDialog(frame,"Title length >20 char enter again");
						  qwe=(JOptionPane.showInputDialog("Enter the Title"));
					  }
					  JLabel title=new JLabel("Title:"+qwe);
					  title.setFont(new Font("Tahoma", Font.BOLD, 16));
				      title.setBounds(100,600,200,200);
					  
				      
				      
						
				      if(count==0)
						{
							  panel1.add(label);
							  panel1.add(annotation);
							  panel1.add(title);
							  JButton Button1 = new JButton(title.getText());
							  Button1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										dtitles.setVisible(false);
										panel1.setVisible(true);
										
											Data.setVisible(false);
										    panel2.setVisible(false);
											panel3.setVisible(false);
											panel4.setVisible(false);
											panel5.setVisible(false);
											panel6.setVisible(false);
											panel7.setVisible(false);
											panel8.setVisible(false);
											panel9.setVisible(false);
											panel10.setVisible(false);
											
											
											
										
									}
								});
							   Button1.setBounds(200,200, 300, 50);	  
							   dtitles.add(Button1);
							   count++;
							   
						}
				      
				      else if(count==1)
				      {
				    	  panel2.add(label);
						  panel2.add(annotation);
						  panel2.add(title);
						  
						  JButton Button2 = new JButton(title.getText());
						  Button2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									dtitles.setVisible(false);
									
										Data.setVisible(false);
									    panel1.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel2.setVisible(true);
										
										
									
								}
							});
						   Button2.setBounds(200, 280, 300, 50);	  
						   dtitles.add(Button2);
						   count++;
						  
				      }
				      else if(count==2)
				      {
				    	  panel3.add(label);
						  panel3.add(annotation);
						  panel3.add(title);
						  JButton Button3 = new JButton(title.getText());
						  Button3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel1.setVisible(false);
										panel2.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel3.setVisible(true);
										
										
									
								}
							});
						   Button3.setBounds(200, 360, 50, 50);	  
						   dtitles.add(Button3);
						   count++;
						  
				      }
				      else if(count==3)
				      {
				    	  panel4.add(label);
						  panel4.add(annotation);
						  panel4.add(title);
						  JButton Button4 = new JButton(title.getText());
						  Button4.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel1.setVisible(false);
										panel3.setVisible(false);
										panel2.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel4.setVisible(true);
										
										
									
								}
							});
						   Button4.setBounds(200, 440, 50, 50);	  
						   dtitles.add(Button4);
						   count++;
						   
				      }
				      else if(count==4)
				      {
				    	  panel5.add(label);
						  panel5.add(annotation);
						  panel5.add(title);
						  JButton Button5 = new JButton(title.getText());
						  Button5.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel1.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel5.setVisible(true);
										
										
									
								}
							});
						   Button5.setBounds(200, 520, 50, 50);	  
						   dtitles.add(Button5);
						   count++;
						   
				      }
				      else if(count==5)
				      {
				    	  panel6.add(label);
						  panel6.add(annotation);
						  panel6.add(title);
						  
						  JButton Button6 = new JButton(title.getText());
						  Button6.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel1.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel6.setVisible(true);
										
										
									
								}
							});
						   Button6.setBounds(200, 600, 50, 50);	  
						   dtitles.add(Button6);
						   count++;
						   
				      }
				      else if(count==6)
				      {
				    	  panel7.add(label);
						  panel7.add(annotation);
						  panel7.add(title);
						  JButton Button7 = new JButton(title.getText());
						  Button7.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel1.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel7.setVisible(true);
										
										
									
								}
							});
						   Button7.setBounds(200,680, 50, 50);	  
						   dtitles.add(Button7);
						   count++;
						   
				      }
				      else if(count==7)
				      {
				    	  panel8.add(label);
						  panel8.add(annotation);
						  panel8.add(title);
						  JButton Button8 = new JButton(title.getText());
						  Button8.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel1.setVisible(false);
										panel9.setVisible(false);
										panel10.setVisible(false);
										panel8.setVisible(true);
										
										
									
								}
							});
						   Button8.setBounds(200, 760, 50, 50);	  
						   dtitles.add(Button8);
						   count++;
						   
				      }
				      else if(count==8)
				      {
				    	  panel9.add(label);
						  panel9.add(annotation);
						  panel9.add(title);
						  JButton Button9 = new JButton(title.getText());
						  Button9.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel1.setVisible(false);
										panel10.setVisible(false);
										panel9.setVisible(true);
										
										
									
								}
							});
						   Button9.setBounds(200,840, 50, 50);	  
						   dtitles.add(Button9);
						   count++;   
				      
				      }
				      else if(count==9)
				      {
				    	  panel10.add(label);
						  panel10.add(annotation);
						  panel10.add(title);
						  JButton Button10 = new JButton(title.getText());
						  Button10.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									dtitles.setVisible(false);
										Data.setVisible(false);
									    panel2.setVisible(false);
										panel3.setVisible(false);
										panel4.setVisible(false);
										panel5.setVisible(false);
										panel6.setVisible(false);
										panel7.setVisible(false);
										panel8.setVisible(false);
										panel9.setVisible(false);
										panel1.setVisible(false);
										panel10.setVisible(true);
										
										
									
								}
							});
						   Button10.setBounds(200,920, 50, 50);	  
						   dtitles.add(Button10);
						   count++;
						   
				      }
				      else 
				      { 
				    	  JOptionPane.showMessageDialog(frame,"NO more photos can be added");
				      }
				      
				      
				}
				else if(result == JFileChooser.CANCEL_OPTION)
				{ 
				   JOptionPane.showMessageDialog(frame,"No File Select");
				   
				}
				
				
				frame.setVisible(true);
				Data.setVisible(true);
				
			}
			
		});
		
		btnNewButton.setBounds(362, 292, 222, 147);
		Data.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("DISPLAY");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jkl = JOptionPane.showInputDialog("Enter 1:To Display Titles"
						+ " Enter 2:To display photos in order"
						+ "Enter anyother:To exit and back to menu");
			
				 
				if(jkl.compareTo("2")==0)
				{
					dtitles.setVisible(false);
					Data.setVisible(false);
					panel1.setVisible(true);
					panel2.setVisible(false);
					panel3.setVisible(false);
					panel4.setVisible(false);
					panel5.setVisible(false);
					panel6.setVisible(false);
					panel7.setVisible(false);
					panel8.setVisible(false);
					panel9.setVisible(false);
					panel10.setVisible(false);
				}
				else if(jkl.compareTo("1")==0)
				{
					Data.setVisible(false);
					panel1.setVisible(false);
				    panel2.setVisible(false);
					panel3.setVisible(false);
					panel4.setVisible(false);
					panel5.setVisible(false);
					panel6.setVisible(false);
					panel7.setVisible(false);
					panel8.setVisible(false);
					panel9.setVisible(false);
					panel10.setVisible(false);
					dtitles.setVisible(true);
					
				}
				else
				{
					Data.setVisible(true);
					dtitles.setVisible(false);
					panel1.setVisible(false);
					panel2.setVisible(false);
					panel3.setVisible(false);
					panel4.setVisible(false);
					panel5.setVisible(false);
					panel6.setVisible(false);
					panel7.setVisible(false);
					panel8.setVisible(false);
					panel9.setVisible(false);
					panel10.setVisible(false);
				}
				
			}
		});
		btnNewButton_1.setBounds(362, 452, 222, 140);
		Data.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Choose an Option ");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(263, 107, 447, 140);
		Data.add(lblNewLabel);
		
		
		frame.getContentPane().add(panel1, "name_178195611898018");
		panel1.setLayout(null);
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu.setBackground(SystemColor.activeCaption);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
				
			}
		});
		btnMenu.setBounds(277, 551, 179, 53);
		
		panel1.add(btnMenu);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBackground(SystemColor.activeCaption);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext.setBounds(492, 551, 179, 53);
		
		panel1.add(btnNext);
		
		
		frame.getContentPane().add(panel2, "name_178207452598793");
		panel2.setLayout(null);
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious.setBackground(SystemColor.activeCaption);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious.setBounds(76, 548, 181, 53);
		
		panel2.add(btnPrevious);
		btnMenu_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_1.setBackground(SystemColor.activeCaption);
		btnMenu_1.setBounds(372, 548, 167, 53);
		
		panel2.add(btnMenu_1);
		btnMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_1.setBackground(SystemColor.activeCaption);
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_1.setBounds(641, 548, 167, 53);
		
		panel2.add(btnNext_1);
		
		
		frame.getContentPane().add(panel3, "name_178216647858534");
		panel3.setLayout(null);
		btnNext_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_5.setBackground(SystemColor.activeCaption);
		btnNext_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_5.setBounds(645, 609, 178, 53);
		
		panel3.add(btnNext_5);
		btnNext_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_5.setBackground(SystemColor.activeCaption);
		btnPrevious_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_5.setBounds(60, 609, 178, 53);
		
		panel3.add(btnPrevious_5);
		btnMenu_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_6.setBackground(SystemColor.activeCaption);
		btnMenu_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_6.setBounds(364, 609, 178, 53);
		
		panel3.add(btnMenu_6);
		
		
		frame.getContentPane().add(panel4, "name_178219829814522");
		panel4.setLayout(null);
		btnNext_6.setBackground(SystemColor.activeCaption);
		btnNext_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_6.setBounds(628, 604, 187, 53);
		
		panel4.add(btnNext_6);
		btnNext_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_6.setBackground(SystemColor.activeCaption);
		btnPrevious_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_6.setBounds(73, 604, 187, 53);
		
		panel4.add(btnPrevious_6);
		btnMenu_7.setBackground(SystemColor.activeCaption);
		btnMenu_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_7.setBounds(365, 604, 187, 53);
		
		panel4.add(btnMenu_7);
		
		
		frame.getContentPane().add(panel5,"name_178222998664137");
		panel5.setLayout(null);
		btnNext_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_7.setBackground(SystemColor.activeCaption);
		btnNext_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_7.setBounds(616, 594, 172, 53);
		
		panel5.add(btnNext_7);
		btnNext_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_7.setBackground(SystemColor.activeCaption);
		btnPrevious_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_7.setBounds(91, 594, 172, 53);
		
		panel5.add(btnPrevious_7);
		btnMenu_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_8.setBounds(358, 594, 172, 53);
		
		panel5.add(btnMenu_8);
		
		
		frame.getContentPane().add(panel6, "name_178225877630818");
		panel6.setLayout(null);
		btnNext_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_8.setBackground(SystemColor.activeCaption);
		btnNext_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_8.setBounds(627, 579, 178, 53);
		
		panel6.add(btnNext_8);
		btnNext_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_8.setBackground(SystemColor.activeCaption);
		btnPrevious_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_8.setBounds(97, 579, 178, 53);
		
		panel6.add(btnPrevious_8);
		btnMenu_9.setBackground(SystemColor.activeCaption);
		btnMenu_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_9.setBounds(369, 579, 178, 53);
		
		panel6.add(btnMenu_9);
		
		
		frame.getContentPane().add(panel7, "name_178234293363519");
		panel7.setLayout(null);
		btnNext_4.setBackground(SystemColor.activeCaption);
		btnNext_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(true);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnNext_4.setBounds(631, 561, 132, 53);
		
		panel7.add(btnNext_4);
		btnPrevious_4.setBackground(SystemColor.activeCaption);
		btnPrevious_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_4.setBounds(136, 561, 132, 53);
		
		panel7.add(btnPrevious_4);
		btnMenu_5.setBackground(SystemColor.activeCaption);
		btnMenu_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_5.setBounds(381, 561, 132, 53);
		
		panel7.add(btnMenu_5);
		
		
		frame.getContentPane().add(panel8, "name_178247131032549");
		panel8.setLayout(null);
		btnNext_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_3.setBackground(SystemColor.activeCaption);
		btnNext_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(true);
				panel10.setVisible(false);
			}
		});
		btnNext_3.setBounds(656, 555, 169, 53);
		
		panel8.add(btnNext_3);
		btnNext_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_3.setBackground(SystemColor.activeCaption);
		btnPrevious_3.setBounds(93, 555, 169, 53);
		
		panel8.add(btnPrevious_3);
		btnMenu_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_4.setBackground(SystemColor.activeCaption);
		btnMenu_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_4.setBounds(386, 555, 169, 53);
		
		panel8.add(btnMenu_4);
		
		
		frame.getContentPane().add(panel9, "name_178255629510164");
		panel9.setLayout(null);
		btnNext_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext_2.setBackground(SystemColor.activeCaption);
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(true);
			}
		});
		btnNext_2.setBounds(646, 539, 183, 53);
		
		panel9.add(btnNext_2);
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(true);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnPrevious_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_2.setBackground(SystemColor.activeCaption);
		btnPrevious_2.setBounds(74, 539, 183, 53);
		
		panel9.add(btnPrevious_2);
		btnMenu_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_3.setBackground(SystemColor.activeCaption);
		btnMenu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_3.setBounds(357, 539, 183, 53);
		
		panel9.add(btnMenu_3);
		
		
		frame.getContentPane().add(panel10, "name_178258336531929");
		panel10.setLayout(null);
		btnPrevious_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrevious_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(true);
				panel10.setVisible(false);
			}
		});
		btnPrevious_1.setBounds(93, 593, 189, 53);
		
		panel10.add(btnPrevious_1);
		btnMenu_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);
			}
		});
		btnMenu_2.setBounds(383, 593, 189, 53);
		
		panel10.add(btnMenu_2);
		
		frame.getContentPane().add(dtitles, "name_196866791629148");
		dtitles.setLayout(null);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dtitles.setVisible(false);
				Data.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				panel8.setVisible(false);
				panel9.setVisible(false);
				panel10.setVisible(false);

				
			}
		});
		btnExit.setBounds(402, 612, 168, 85);
		
		dtitles.add(btnExit);
		
		
		
	
	}
	
	

}

