public class Message {

	  private String text;
	     private String recipient;
	     private int id ;
	     
	 
	     public Message(String text,String recepient,int id) {
	            this.text=text;
	            this.recipient=recipient;
	            this.id=id;
	            }
	  public void getDetails() {
		  System.out.println(""+this.recipient+"\t\t\t\t"+this.text+"\t\t\t"+this.id);
	  }
	  public String getText() {
		  return text;
	  }
	  public void setText(String text) {
		  this.text=text;
		  
	  }
	  public String getRecipient() {
		  return recipient;
	  }
	  public void setRecipient(String recipient) {
		  this.recipient=recipient;
		  
	  }
	  public int getId() {
		  return id;
	  }
	  public void setId(int id) {
		  this.id=id;
		  
	  }
}
