package bulider;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Computer {

    private String procesor;
    private String ram;
    private String hdd;
    private String graphic;

    public Computer(String procesor, String ram, String hdd, String graphic) {
        this.procesor = procesor;
        this.ram = ram;
        this.hdd = hdd;
        this.graphic = graphic;
    }

    public static class ComputerBuildier{
        private String procesor;
        private String ram;
        private String hdd;
        private String graphic;

        public ComputerBuildier addprocesor(String procesor){
            this.procesor=procesor;
            return this;
        }

        public ComputerBuildier addram(String ram){
            this.ram=ram;
            return this;
        }

        public ComputerBuildier addhdd(String hdd){
            this.hdd=hdd;
            return this;
        }

        public ComputerBuildier addgraphic(String graphic){
            this.graphic=graphic;
            return this;

        }

        public Computer build(){
            return new Computer(procesor,ram,hdd,graphic);
        }


    }
}
