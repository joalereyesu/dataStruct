from crypt import methods
from flask import Flask, render_template, request, url_for, redirect
from jinja2 import Template, FileSystemLoader, Environment

templates = FileSystemLoader('templates')
environment = Environment(loader = templates)

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('Home.html')

@app.route('/getAllSongs', methods=['GET'])
def getAllSongs():
    pass

@app.route('/getSong/<songName>', methods=['GET'])
def getSong(songName):
    pass

@app.route('/newSong/<songName>', methods=['POST'])
def newSong(songName):
    pass

@app.route('/deleteSong/<songName>', methods=['DELETE'])
def deleteSong(songName):
    pass

if __name__ == "__main__":
    app.run(host="localhost", port = 8000, debug=True)

