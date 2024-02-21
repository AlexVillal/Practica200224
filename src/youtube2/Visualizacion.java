/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube2;

/**
 *
 * @author pedro
 */
public class Visualizacion {
    Usuario Espectador;
    Video Video;
    public Visualizacion () {
    }
    public Visualizacion (Video Video,Usuario Viewer) {
        this.Espectador= Viewer;
        this.Video= Video;
    }    
    public Video getVideo() {
            return Video;
        }
    public void setVideo (Video Video) {
            this.Video= Video;
        }
    public Usuario getViewer() {
            return Espectador;
        }
    public void setViewer (Usuario Vierwer) {
            this.Espectador= Vierwer;
        }
        
}

