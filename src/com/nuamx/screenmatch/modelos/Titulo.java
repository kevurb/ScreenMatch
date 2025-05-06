package com.nuamx.screenmatch.modelos;

public class Titulo {
        // el packeage debe tipar los atributos y metodos.
        public String nombre;
        private int fechaDeLazamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private int rateMovie;
        private double media;
        private int conteoRates;
        public void mostrarFichaTecnica(){
            System.out.println("El nombre es:" + nombre);
            System.out.println("Fecha de lanzamiento es:" + fechaDeLazamiento);
            System.out.println("Duracion en minutos:" + getDuracionEnMinutos());
            System.out.println("Fecha de lanzamiento es:" + incluidoEnElPlan);
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setFechaDeLazamiento(int fechaDeLazamiento) {
            this.fechaDeLazamiento = fechaDeLazamiento;
        }
        public void setDuracionEnMinutos(int duracionEnMinutos) {
            this.duracionEnMinutos = duracionEnMinutos;
        }
        public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }

        public int getDuracionEnMinutos() {
            return duracionEnMinutos;
        }


        public void evalua(double rate){
                rateMovie += rate;
                conteoRates++;
            }
            public double average ( ){
                return rateMovie/conteoRates;
            }
            public int getConteoRates (){
                return conteoRates;
            }
}
