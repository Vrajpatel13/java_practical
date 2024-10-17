class bill {
    public static void main(String[] args) {
        int Code[]={1,2,3,4,5};
       double tax=0,total=0,itembill;
       float Price[]={200,2500,50,4,100};

        for(int i=0;i<Code.length;i++)
        {
        int code=Code[i];
        float price=Price[i];
        switch(code)
        {
        case 1:
        tax=0.08*price;
        break;
        case 2:
        tax=0.12*price;
        break;
        case 3:
        tax=0.05*price;
        break;
        case 4:
        tax=0.075*price;
        break;
        case 5:
        tax=0.03*price;
        break;
        }
        itembill=price+tax;
        System.out.println("Code:"+code+", price of item: "+itembill);
        total+=itembill;

    }
   

 System.out.println("The total amount of electronic products is:"+total);
}
}
