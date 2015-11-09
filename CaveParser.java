public class CaveParser 
{
	private String theJSON;
	
	public CaveParser(String json)
	{
		this.theJSON = json;
	}
	
	public JSONObject parse()
	{
		//will walk through our json string and create a JSONObject (which is a
		//collection of name/value pairs where values can be JSONObjects, JSONArrays,
		//or literals (like 5 or 7)
		
		for (int i = 0; i < theJSON.length(); i++)
		{
			if (theJSON.charAt(i) == '{')
				System.out.println("JSONObject start");
			if (theJSON.charAt(i) == '}')
				System.out.println("JSONObject end");
			if (theJSON.charAt(i) == '[')
				System.out.println("JSONArray start");
			if (theJSON.charAt(i) == ']')
				System.out.println("JSONArray end");
		}
		return new JSONObject();
	}
}