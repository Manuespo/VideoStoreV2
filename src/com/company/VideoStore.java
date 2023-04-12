package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Film> films=new ArrayList<Film>();
    private ArrayList<Customer> customers=new ArrayList<Customer>();
    private ArrayList<Rent> rents=new ArrayList<Rent>();

    public VideoStore() {
    }

    public void addFilm(String title, String creationDate, int duration, int classification, String country, String description, Category category, int stock)
    {
        films.add(new Film(title,creationDate,duration,classification,country,description,category,stock));
    }
    public void addCustomer(String name, int phoneNumber, String address)
    {
        customers.add(new Customer(name,phoneNumber,address));
    }
    public void rentByTitle(String title,String name, int phoneNumber, String address, int rentdays)
    {
        boolean founded=false;
        for (Film film:
                films) {
            if (title.equals(film.getTitle()))
            {
                founded=true;
                if (film.getStock()>0)
                {
                    film.setStock(film.getStock()-1);
                    if (findCustomer(name,phoneNumber,address)!=null){
                        rents.add(new Rent(findCustomer(name,phoneNumber,address),film,rentdays));
                    }
                    else {
                        customers.add(new Customer(name,phoneNumber,address));
                        rents.add(new Rent(customers.get(customers.size()-1),film,rentdays));
                    }
                }
                else {
                    System.out.println("Out of stock");
                }
            }
        }
        if (!founded)
            System.out.println("film not found");

    }
    public Customer findCustomer(String name, int phoneNumber, String address)
    {
        boolean founded=false;
        Customer aux=new Customer(name,phoneNumber,address);
        for (Customer customer: customers) {
            if (customer.getName().compareTo(name)==0){
                founded=true;
            }
        }
        if (!founded)
        {
            return null;
        }
        else return aux;
    }
    public String showFilms()
    {
        return "Films " + films;
    }
    public String showCustomers()
    {
        return "Customers " + customers;
    }
    public String showDayDevolutions()
    {
        String aux="";
        for (Rent rent: rents) {
            if (rent.getDueDate().equals(LocalDate.now()))
            {
                aux+=rent.toString();
            }
        }
        if (aux.compareTo("")==0)
            return "No Devolutions today";
        else return aux;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Rent> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                " rents=" + rents +
                '}';
    }
}
