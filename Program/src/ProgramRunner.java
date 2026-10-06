import java.util.ArrayList;

public class ProgramRunner
	{
		static ArrayList<Show> TVshows = new ArrayList<>();
		public static void main(String[] args)
			{
				TVshows.add(new Show("South park", "Comedy", 29));
				TVshows.add(new Show("The Office", "Comedy", 20));
				TVshows.add(new Show("Breaking Bad", "Crime", 5));
				TVshows.add(new Show("Dexter", "Crime", 9));
				TVshows.add(new Show("My Little Pony", "Kids", 16));
				printList();
				moreSeasons();
				TVshows.get(0).setTitle( "Troll Hunters");
				printList();
			}
		public static void printList()
		{
			for(int i = 0; i < TVshows.size(); i++)
				{
					System.out.println(TVshows.get(i).getTitle() + "  " + TVshows.get(i).getGenre()+ "  " +TVshows.get(i).getNumberOfSeasonsAired());
					
				}
			
		}
		public static void moreSeasons()
		{
			for(int i = 0; i < TVshows.size(); i++) 
				{
					Show currentShow = TVshows.get(i);
		            int updatedSeasons = currentShow.getNumberOfSeasonsAired() + 1;
		            currentShow.setNumberOfSeasonsAired(updatedSeasons);
		            System.out.println(TVshows.get(i).getTitle() + "  " + TVshows.get(i).getGenre()+ "  " +TVshows.get(i).getNumberOfSeasonsAired());
				}
		}

	}
