public class Bicycle {

	private String ownerName;
    private String tagNo;
	public Bicycle () {
		ownerName = "Unknown";
		tagNo = "Unknown";
   }
		
	public Bicycle (String TagNo,String name) {
		tagNo=TagNo;
		ownerName =name;	

	}
	public String getOwnerName (){
		return ownerName;
	}
	public void setOwnerName (String name) {
		ownerName =name;
	}
	public String getTagNo(){
		return tagNo;
	}
	public void setTagNo (String TagNo) {
		tagNo=TagNo;
	}
	
}
