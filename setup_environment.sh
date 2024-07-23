python3 -m venv venv
source venv/bin/activate

# pip3 install torch torchvision torchaudio --extra-index-url https://download.pytorch.org/whl/cu116
pip install torch==1.13.0+cu116 torchvision==0.14.0+cu116 torchaudio==0.13.0 --extra-index-url https://download.pytorch.org/whl/cu116
pip3 install pyg-lib torch-scatter torch-sparse torch-cluster torch-spline-conv torch-geometric -f https://data.pyg.org/whl/torch-1.13.0+cu116.html
pip install -r req_linux.txt