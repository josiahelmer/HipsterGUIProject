package hipster.view;

import java.awt.Color;

import hipster.controller.HipsterController;
import hipster.model.Book;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private JButton changeTitleButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		changeTitleButton = new JButton("Change title");
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change books");
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();

	}
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		
		phraseComboBox.setModel(phraseModel);
		

		
	
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(phraseComboBox);
		this.add(bookAuthorLabel);
		this.add(bookPageCountLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
		this.add(changeTitleButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 98, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookPriceLabel, -6, SpringLayout.NORTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, changeBookButton, 7, SpringLayout.SOUTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.EAST, changeBookButton, -72, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, bookAuthorLabel, -119, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookPageCountLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookSubjectLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPageCountLabel, 6, SpringLayout.SOUTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookTitleLabel, 6, SpringLayout.SOUTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0, SpringLayout.WEST, bookAuthorLabel);

	}
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: "+ tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title:" + tempBooks[startClick].getPageCount());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPrice());
					bookPriceLabel.setText("Book price "+ tempBooks[startClick].getPrice());
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages:");
					bookPriceLabel.setText("Book price:");
				}
			}
		});
	}
}
