package com.example.awesomefat.csc518_listexample;

public class ItineraryStack
{
    private ItineraryStackNode top;
    private int count;

    public ItineraryStack()
    {
        this.top = null;
        this.count = 0;
    }

    public ItineraryStackNode peek()
    {
        return this.top;
    }

    public void push(String destination)
    {
        ItineraryStackNode isn = new ItineraryStackNode(destination);
        if(this.top == null)
        {
            this.top = isn;
        }
        else
        {
            isn.setNextNode(this.top);
            this.top = isn;
        }
        this.count++;
    }

    public ItineraryStackNode pop()
    {
        ItineraryStackNode nodeToReturn = this.top;
        if(this.top != null)
        {
            this.top = this.top.getNextNode();
            nodeToReturn.setNextNode(null);
            this.count--;
        }
        return nodeToReturn;
    }

    public void display()
    {
        ItineraryStackNode currNode = this.top;
        System.out.println("*** Itinerary: ");
        //Remove any itinerary destination strings
        CoreItinerary.theItineraryStrings.clear();
        while(currNode != null)
        {
            currNode.display();
            // Populate the itinerary destination linked list with the destinations
            // currently in the itinerary stack.
            CoreItinerary.theItineraryStrings.addFirst(currNode.getPayload());
            //
            currNode = currNode.getNextNode();
        }
        System.out.println("");
    }

    public int getCount() {
        return count;
    }
}
