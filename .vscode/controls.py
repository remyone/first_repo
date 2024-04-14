import pygame
import sys

def events():
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()

def update_screen(screen):
    screen.fill("orange")
    pygame.display.flip()