package com.idi.Entity;

public final class Constantes {

    public static int LARGO_PANTALLA = -1;
    public static int ANCHO_PANTALLA = -1;
    public static long TIEMPO_PANTALLA_FIN_JUEGO=3000;

    //VELOCIDADES DESPLAZAMIENTO
    public static final int VELOCIDA_INICIAL_JUGADOR = 20;
    public static final int VELOCIDAD_DISPARO_JUGADOR = 50;
    public static long VELOCIDAD_FOTOGRAMA_EXPLOCION_ENEMIGO = 10;
    public static final int DISPARO_JUGADOR_AUMENTO_Y_INICIAL = 10;
    public static final int VELOCIDAD_DISPARO_ENEMIGO = 50;
    
    public static final long DELAY_CAPTAR_DISPARO_JUGADOR = 500;
    public static final long  DELAY_CAPTAR_CABO = 2000;
    public static final long DELAY_CAPTAR_SARGENTO = 3000;
    public static final long DELAY_CAPTAR_CORONEL = 2000;
    public static final long DELAY_CAPTAR_TENIENTE = 1500;
    
    public static float VELOCIDAD_ENEMIGO_CABO_1 = 9;
    public static float VELOCIDAD_ENEMIGO_CABO_2 = 9;
    public static float VELOCIDAD_ENEMIGO_SARGENTO_1 = 10;
    
    public static float VELOCIDAD_ENEMIGO_CORONEL_1 = 11;
    public static float VELOCIDAD_ENEMIGO_CORONEL_2 = 11;
    public static float VELOCIDAD_ENEMIGO_TENIENTE_1 = 12;
    public static float VELOCIDAD_ENEMIGO_TENIENTE_2 = 12;
    public static int VELOCIDAD_CAIDA_ESCUDO = 20;
    
    

    public static int POSICION_INICIAL_JUGADOR_X = -1;
    public static int POSICION_INICIAL_JUGADOR_Y = -1;
    public static final int VIDAS_JUGADOR = 4;

    public static final int BONUS_CABO = 30;
    public static final int BONUS_SARGENTO = 40;
    public static final int BONUS_CORONEL = 50;
    public static final int BONUS_TENIENTE = 60;
    public static final int NUMERO_VIDAS_CABO = 1;
    public static final int NUMERO_VIDAS_SARGENTO = 1;
    public static final int NUMERO_VIDAS_CORONEL = 1;
    public static final int NUMERO_VIDAS_TENIENTE = 2;

    public static final int NUMERO_NAVES_NIVEL_UNO = 24;
    public static final int TAMANO_LADO_EXPLOCION_ENEMIGO = 10;

    public static final int SALTOS_BLOQUE_ENEMIGO = 60;
    public static final int LOGINTUD_SALTO_BLOQUE_ENEMIGO = 5;
    public static final int DISTANCIA_HORIZONTAL_ENEMIGOS = 25;
    public static final int DISTANCIA_VERTICAL_ENEMIGOS = 25;

    public static final int TAMANO_EXPLOCION_ENEMIGO = 50;
    public static int DELAY_DISPARO_ATACANTES = 5000;
     public static int FOTOGRAMAS_COLISION = 4;

    //SONIDO
    public static int TAMANO_BUFFER_SONIDO_DISPAROS = 2;
    public static int TAMANO_BUFFER_SONIDO_EXPLOCINES = 2;
    public static int TAMANO_BUFFER_SONIDO_ENEMIGO = 3;

    //STRINGS PARA LOCALIZAR UNA TEXTURA EN EL TEXTURASMANAGER
    public static String TEXTURAS_TEXTURA_JUGADOR = "jugador";
    public static String TEXTURAS_TEXTURA_JUGADOR_ESCUDO = "escudo";
    static String TEXTURAS_TEXTURA_JUGADOR_ESCUDO_OBJETO="escudoObjeto";
    public static String TEXTURAS_TEXTURA_JUGADOR_VIDAS = "jugadorVidas";
    public static String TEXTURAS_TEXTURA_ENEMIGO_CABO_1 = "cabo1";
    public static String TEXTURAS_TEXTURA_ENEMIGO_CABO_2 = "cabo2";
    public static String TEXTURAS_TEXTURA_ENEMIGO_SARGENTO_1 = "sargento1";
    public static String TEXTURAS_TEXTURA_ENEMIGO_SARGENTO_2 = "sargento2";
    public static String TEXTURAS_TEXTURA_ENEMIGO_CORONEL_1 = "coronel1";
    public static String TEXTURAS_TEXTURA_ENEMIGO_CORONEL_2 = "coronel2";
    public static String TEXTURAS_TEXTURA_ENEMIGO_TENIENTE_1 = "teniente1";
    public static String TEXTURAS_TEXTURA_ENEMIGO_TENIENTE_2 = "teniente2";
    
    public static String TEXTURAS_TEXTURA_DISPAROJUGADOR = "disparoJugador";
    public static String TEXTURAS_TEXTURA_DISPARO_ENEMIGO_SARGENTO="disparoSargento";
    public static String TEXTURAS_TEXTURA_DISPARO_ENEMIGO_CABO = "disparoCabo";
    public static String TEXTURAS_TEXTURA_DISPARO_ENEMIGO_CORONEL= "disparoCoronel";
    public static String TEXTURAS_TEXTURA_DISPARO_ENEMIGO_TENIENTE = "disparoTeniente";

    //PATHS
    public static final String PATH_SPRITE_NAVE_JUGADOR = "imagenes/jugador.png";
    public static final String PATH_SPRITE_NAVE_JUGADOR_ESCUDO = "imagenes/escudo.png";
    static String PATH_SPRITE_NAVE_JUGADOR_ESCUDO_OBJETO="imagenes/escudoObjeto.png";
  
    public static final String PATH_SPRITE_NAVE_CABO_1 = "imagenes/cabo1.png";
    public static final String PATH_SPRITE_NAVE_CABO_2 = "imagenes/cabo2.png";
    public static final String PATH_SPRITE_NAVE_SARGENTO_1 = "imagenes/sargento1.png";
    public static final String PATH_SPRITE_NAVE_SARGENTO_2 = "imagenes/sargento2.png";
    public static final String PATH_SPRITE_NAVE_CORONEL_1 = "imagenes/coronel1.png";
    public static final String PATH_SPRITE_NAVE_CORONEL_2 = "imagenes/coronel2.png";
    public static final String PATH_SPRITE_NAVE_TENIENTE_1 = "imagenes/teniente1.png";
    public static final String PATH_SPRITE_NAVE_TENIENTE_2 = "imagenes/teniente2.png";
    
    public static String PATH_SPRITE_DISPARO_JUGADOR = "imagenes/disparoJugador.png";
    public static String PATH_SPRITE_DISPARO_CABO = "imagenes/disparoCabo.png";
    public static String PATH_SPRITE_DISPARO_SARGENTO="imagenes/disparoSargento.png";
    public static String PATH_SPRITE_DISPARO_CORONEL="imagenes/disparoCoronel.png";
    public static String PATH_SPRITE_DISPARO_TENIENTE="imagenes/disparoTeniente.png";
    
    public static final String PATH_ANIMACION_EXPLOCION_ENEMIO_1 = "imagenes/explosion.png";
    public static final String PATH_ANIMACION_EXPLOCION_ENEMIO_2 = "imagenes/explosion2.png";

    public static String PATH_FONDO = "imagenes/fondoScroll.png";
    
    public static final String PATH_SONIDO_EXPLOCION_1 = "sonidos/explosion.wav";
    public static String PATH_SONIDO_DISPARO_JUGADOR = "sonidos/shoot.wav";
    public static String PATH_SONIDO_DISPARO_ENEMIGO = "sonidos/laserJugador.wav";
    public static String PATH_MUSICA_FONDO_ESCENA = "musica/background.mp3";
    public static String PATH_SPRITE_JUGADOR_VIDAS = "imagenes/jugadorVidas.png";
    public static int NUMERO_RECORS_GUARDADOS=5;
    
    
    //HELP
    static long TIEMPO_APARICION_ESCUDO=40000;
    static long TIEMPO_DURACION_ESCUDO=6000;
    public static long TIEMPO_MAXIMO_CLICK_PAUSAR=1000;
    public static long TIEMPO_MAXIMO_TECLA_P=300;


}
