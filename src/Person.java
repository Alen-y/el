class Person{
    String name;
    int id;


    public Person(String name, int id){
        this.id = id;
        this.name = name;
    }

    public Person() {

    }


    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        final Person person = (Person)obj;
        if(!this.getName().equals(person.getName())){
            return false;
        }
        if(this.getId() != person.getId()){
            return false;
        }
        return true;

    }

}