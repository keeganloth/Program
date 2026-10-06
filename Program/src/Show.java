
public class Show
	{
		private String title;
		private String genre;
		private int numberOfSeasonsAired;

	public Show(String t, String g, int s)
			{
			title= t;
			genre = g;
			numberOfSeasonsAired = s;
			}

	public String getTitle()
		{
			return title;
		}

	public void setTitle(String title)
		{
			this.title = title;
		}

	public String getGenre()
		{
			return genre;
		}

	public void setGenre(String genre)
		{
			this.genre = genre;
		}

	public int getNumberOfSeasonsAired()
		{
			return numberOfSeasonsAired;
		}

	public void setNumberOfSeasonsAired(int numberOfSeasonsAired)
		{
			this.numberOfSeasonsAired = numberOfSeasonsAired;
		}

	}
