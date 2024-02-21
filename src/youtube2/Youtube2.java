/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package youtube2;

/**
 *
 * @author pedro
 */
public class Youtube2 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("limon");
        Video video = new Video ("Aprendiendo java",2400,"http;//limon.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuario usuario2=new Usuario("Perla");
        Comentario comment1= new Comentario("Asco de pagina", usuario2);
        System.out.println("el usuario: "+usuario2.getNombre() + " publico el comentario: "+comment1.getContenido());
    }
}