package Collection_HW8;

public interface ListCustom  {

    /**
     *
     * @return the number of elements in this list
     */
    public int size();

    /**
     *
     * @return new size array
     */
    public Object[] grow();

    /**
     * Returns the element at the specified position in this list.
     */
    public Object get(int index);

    /**
     *
     * @param object element to be inserted
     * @return true if element added successfully
     */
    public boolean add(Object object);

    /**
     *
     * @param object element to be inserted
     * @param index index at which the specified element is to be inserted
     * @return true if element added successfully
     */
    public boolean add (Object object,int index);

    /**
     *
     * @param index position in array
     * @return true if element removed successfully
     */
    public boolean remove(int index);

    /**
     *
     * @param object element to be removed
     * @return true if element removed successfully
     */
    public boolean remove(Object object);

    /**
     *
     * @return {@code true} if this list contains the specified element
     */
    public boolean contain(Object object);

    /**
     *
     * @return {@code true} if the specified object is equal to this list
     */
    public boolean equals(Object arr);

    /**
     *
     * @return if removes all of the elements from this list
     */
    public boolean clear();
}
