import pygame
import sys

def run():

    pygame.init()

    screen = pygame.display.set_mode((640, 480))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()

    pygame.display.flip()

run()