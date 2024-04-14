import pygame
import controls

def run():
    screen = pygame.display.set_mode((640, 480))

    while True:
        controls.events()
        controls.update_screen(screen)

run()