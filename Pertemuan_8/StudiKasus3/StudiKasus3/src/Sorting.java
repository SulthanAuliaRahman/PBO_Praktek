

public class Sorting
{
    public static void selectionSort(Integer[] list)
    {
        int min;
        Integer temp;

        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) > 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    public static void insertionSort(Integer[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Integer key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) < 0)
            {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }

    public static void selectionSort(String[] list)
    {
        int min;
        String temp;

        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) > 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    public static void insertionSort(String[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            String key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) < 0)
            {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
    public static void selectionSort(Salesperson[] list)
    {
        int min;
        Salesperson temp;

        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) > 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    public static void insertionSort(Salesperson[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Salesperson key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) < 0)
            {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}