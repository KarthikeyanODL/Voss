from zipfile import ZipFile

import os
import settings


# Method to create all known-images from the zip file
def extract_encoded_files(data):
     try:

            known_encodings_file_path = settings.DATA_PATH + '/known_encodings_file.csv'
            people_file_path = settings.DATA_PATH + '/people_file.csv'

            # Check the encoded files are already present in the File Path, if yes delete File
            if (os.path.exists(known_encodings_file_path)):
                os.remove(known_encodings_file_path)
            if (os.path.exists(people_file_path)):
                os.remove(people_file_path)

            # Extract the encoded files
            encoded_zipfile = ZipFile(data)
            encoded_zipfile.extractall(settings.DATA_PATH)


     except Exception:
         raise  Exception("Unable to extract the ZIP file")

